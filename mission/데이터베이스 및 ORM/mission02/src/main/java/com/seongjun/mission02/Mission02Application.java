package com.seongjun.mission02;

import com.seongjun.mission02.mapper.ProductMapper;
import com.seongjun.mission02.model.Product;
import com.seongjun.mission02.repository.ProductRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@MapperScan("com.seongjun.mission02.mapper")
public class Mission02Application implements CommandLineRunner {

    /* 목표. 1. Spring Boot 프레임워크에서 MyBatis 라이브러리를 사용합니다. MyBatis를 사용하여 데이터베이스와의 CRUD(Create, Read, Update, Delete) 작업을 구현합니다. MyBatis를 이용한 데이터 CRUD 과정과 결과를 확인하고 스크린샷으로 제출.
            2. Spring Boot 프레임워크에서 JPA(Java Persistence API) 기술을 사용합니다. JPA를 활용하여 데이터베이스와의 CRUD 작업을 구현합니다. JPA를 이용한 데이터 CRUD 과정과 결과를 확인하고 스크린샷으로 제출.
            3. Spring Boot 애플리케이션에서 MyBatis와 JPA를 함께 사용하는 방법을 적용합니다. MyBatis와 JPA를 병행하여 데이터베이스 작업을 수행합니다. MyBatis와 JPA를 동시에 사용하는 과정과 결과를 스크린샷으로 제출.

    */

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Mission02Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n---- MyBatis & JPA 병행 CRUD 작업 시작 ----");

        // --- 1. MyBatis를 이용한 CRUD 작업 ---
        System.out.println("\n--- 1. MyBatis: 상품 삽입 (Create) ---");
        Product mybatisProduct = new Product(
                0, "MYB-001", "MyBatis 테스트 상품", new BigDecimal("10000.00"), 50,
                "MyBatis로 추가된 상품입니다.", "SKU-MYB001", "Electronics", LocalDate.of(2024, 1, 1),
                LocalTime.of(10, 0, 0), LocalDateTime.now(), null
        );
        int mybatisInsertCount = productMapper.insertProduct(mybatisProduct);
        System.out.println("MyBatis 삽입된 상품 수: " + mybatisInsertCount + ", 자동 생성된 ID: " + mybatisProduct.getProductId());


        System.out.println("\n--- 2. MyBatis: 상품 ID로 조회 (Read) ---");
        Product foundMybatisProduct = productMapper.selectProductById(mybatisProduct.getProductId());
        System.out.println("MyBatis 조회된 상품 정보 (ID " + foundMybatisProduct.getProductId() + "): " + foundMybatisProduct);


        System.out.println("\n--- 3. MyBatis: 상품 정보 수정 (Update) ---");
        foundMybatisProduct.setPrice(new BigDecimal("12000.00"));
        foundMybatisProduct.setStockQuantity(45);
        foundMybatisProduct.setDescription("MyBatis로 수정된 상품 설명입니다.");
        foundMybatisProduct.setLastUpdateTime(LocalTime.now());
        int mybatisUpdateCount = productMapper.updateProduct(foundMybatisProduct);
        System.out.println("MyBatis 수정된 상품 수: " + mybatisUpdateCount + ", 수정된 상품 ID: " + foundMybatisProduct.getProductId());

        // --- 4. JPA를 이용한 CRUD 작업 ---
        System.out.println("\n--- 4. JPA: 상품 삽입 (Create) ---");
        Product jpaProduct = new Product(
                0, "JPA-001", "JPA 테스트 상품", new BigDecimal("25000.00"), 80,
                "Spring JPA로 추가된 상품입니다.", "SKU-JPA001", "Apparel", LocalDate.of(2024, 6, 1),
                LocalTime.of(11, 0, 0), LocalDateTime.now(), null
        );
        Product savedJpaProduct = productRepository.save(jpaProduct);
        System.out.println("JPA 삽입된 상품 정보: " + savedJpaProduct);


        System.out.println("\n--- 5. JPA: 상품 ID로 조회 (Read) ---");
        Optional<Product> foundJpaProductOptional = productRepository.findById(savedJpaProduct.getProductId());
        if (foundJpaProductOptional.isPresent()) {
            Product foundJpaProduct = foundJpaProductOptional.get();
            System.out.println("JPA 조회된 상품 정보 (ID " + foundJpaProduct.getProductId() + "): " + foundJpaProduct);

            System.out.println("\n--- 6. JPA: 상품 정보 수정 (Update) ---");
            foundJpaProduct.setPrice(new BigDecimal("30000.00"));
            foundJpaProduct.setStockQuantity(75);
            foundJpaProduct.setDescription("JPA로 업데이트된 상품 설명입니다.");
            Product updatedJpaProduct = productRepository.save(foundJpaProduct);
            System.out.println("JPA 수정된 상품 정보: " + updatedJpaProduct);
        } else {
            System.out.println("JPA 상품을 찾을 수 없어 업데이트를 건너뜝니다.");
        }


        // --- 7. 두 기술로 모두 조회 (공존 확인) ---
        System.out.println("\n--- 7. 모든 상품 목록 조회 (MyBatis로 조회) ---");
        List<Product> allProductsMyBatis = productMapper.selectAllProducts();
        System.out.println("MyBatis로 조회된 총 상품 수: " + allProductsMyBatis.size());
        allProductsMyBatis.forEach(product -> System.out.println(" - " + product.getProductName() + " (ID: " + product.getProductId() + ", Source: MyBatis)"));

        System.out.println("\n--- 8. 모든 상품 목록 조회 (JPA로 조회) ---");
        List<Product> allProductsJPA = productRepository.findAll();
        System.out.println("JPA로 조회된 총 상품 수: " + allProductsJPA.size());
        allProductsJPA.forEach(product -> System.out.println(" - " + product.getProductName() + " (ID: " + product.getProductId() + ", Source: JPA)"));


        // --- 9. 삭제 (각각의 기술로 삭제) ---
        System.out.println("\n--- 9. MyBatis: 상품 삭제 ---");
        if (mybatisProduct.getProductId() != 0) {
            int deleteCount = productMapper.deleteProduct(mybatisProduct.getProductId());
            System.out.println("MyBatis 삭제된 상품 수: " + deleteCount + ", ID: " + mybatisProduct.getProductId());
            Product deletedMybatisCheck = productMapper.selectProductById(mybatisProduct.getProductId());
            System.out.println("MyBatis 삭제 확인 (null이어야 함): " + deletedMybatisCheck);
        }

        System.out.println("\n--- 10. JPA: 상품 삭제 ---");
        if (savedJpaProduct != null && savedJpaProduct.getProductId() != 0) {
            productRepository.deleteById(savedJpaProduct.getProductId());
            System.out.println("JPA 삭제된 상품 ID: " + savedJpaProduct.getProductId());
            Optional<Product> deletedJpaCheck = productRepository.findById(savedJpaProduct.getProductId());
            System.out.println("JPA 삭제 확인 (Optional.empty()여야 함): " + deletedJpaCheck);
        }

        System.out.println("\n---- MyBatis & JPA 병행 CRUD 작업 완료 ----");
    }
}