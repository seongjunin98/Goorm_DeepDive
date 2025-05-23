package com.seongjun.handlermethod;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Controller
@RequestMapping("/first/*")
@SessionAttributes("id")
public class FirstController {

    @GetMapping("regist")
    public void regist(){}

    @PostMapping("regist")
    public String registMenu(Model model, WebRequest request) {

        /* WebRequest 객체의 getParameter() 를 통해 클라이언트로부터 전달 된 파라미터를 가져올 수 있다.*/
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int categortyCode = Integer.parseInt(request.getParameter("categoryCode"));

        /* 클라이언트로부터 전달 받은 값을 통해 응답할 화면의 메세지를 생성한다. */
        String message = name + "을(를) 신규 메뉴 목록의 " + categortyCode + "번 카테고리에 " + price + "원으로 등록 하셨습니다!";
        System.out.println("message =" + message);

        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("modify")
    public void modify(){}

    @PostMapping("modify")
    public String modifyMenuPrice(Model model,
                                  @RequestParam(required = false) String modifyName, //  @RequestParam 명시적으로 작성
                                  @RequestParam(defaultValue = "0") int modifyPrice) {

        String message = modifyName + "메뉴의 가격을 " + modifyPrice + "원으로 가격을 변경하였습니다.";
        System.out.println("message = " + message);

        model.addAttribute("message", message);

        return "first/messagePrinter";

    }

    @PostMapping("modifyAll")
    public String modifyMnue(Model model, @RequestParam Map<String, String> parameters){

        String modifyName = parameters.get("modifyName2");
        int modifyPrice = Integer.parseInt(parameters.get("modifyPrice2"));

        String message = "메뉴의 이름을 " + modifyName + "(으)로, 가격을 " + modifyPrice +"원 으로 변경하였습니다.";

        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("search")
    public void search(){}

    @PostMapping("search")
    public String searchMenu(@ModelAttribute("menu") MenuDTO menu) { //@ModelAttribute 생략 가능하지만 명시적으로 작성

        System.out.println("menu" + menu);

        return "first/searchResult";
    }

    @GetMapping("login")
    public void login(){}

    @PostMapping("login1")
    public String sessionTest1(HttpSession session, @RequestParam String id){

        session.setAttribute("id", id);

        return  "first/loginResult";
    }

    @GetMapping("logout1")
    public String logoutTest1(HttpSession session){

        session.invalidate();

        return "first/loginResult";
    }

    @PostMapping("login2")
    public String sessionTest2(Model model, @RequestParam String id){

        model.addAttribute("id", id);

        return "first/loginResult";
    }

    /* SessionAttributes로 등록된 값은 session의 상태를 관리하는 SessionStatus의 setComplete() 메소드를 호출해야
    * 사용이 만료된다. */
    @GetMapping("logout2")
    public String logoutTest2(SessionStatus sessionStatus) {

        sessionStatus.setComplete();

        return "first/loginResult";
    }

    @GetMapping("body")
    public void body(){}

    @PostMapping("body")
    public void bodyTest(@RequestBody String body,
                         @RequestHeader("content-type") String contentType,
                         @CookieValue(value = "JSESSIONID", required = false) String sessionId
                         ){

        System.out.println("body " + body);
        System.out.println("contentType " + contentType);
        System.out.println("sessionId = " + sessionId);

    }

}
