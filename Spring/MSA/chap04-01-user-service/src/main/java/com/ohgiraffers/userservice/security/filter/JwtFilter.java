package com.ohgiraffers.userservice.security.filter;

import com.ohgiraffers.userservice.security.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/* OncePerRequestFilter를 상속 받아 doFilterInternal을 오버라이딩한다. (반드시 한 번만 실행 되는 필터) */
@Slf4j
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        /* 요청 헤더에 담긴 토큰의 유효성 판별 및 인증 객체 저장 */
        String authorizationHeader = request.getHeader("Authorization");
        log.info("Authorization header: {}", authorizationHeader);

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring(7);
            log.info("Token: {}", token);
            if(jwtUtil.validateToken(token)) {
                Authentication authentication = jwtUtil.getAuthentication(token);
                /* 인증이 완료 되었고 이후 인증 필터는 건너 뛰게 된다. */
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        /* 위의 if문에 걸리지 않아 Authentication 객체가 설정 되지 않으면 다음 필터(인증 필터)가 실행 된다. */
        filterChain.doFilter(request, response);
    }
}
