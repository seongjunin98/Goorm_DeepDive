package com.seongjun.mission02;

import com.seongjun.mission02.mapper.ProductMapper;
import com.seongjun.mission02.model.Product;
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

@SpringBootApplication
@MapperScan("com.seongjun.mission02.mapper")

/* 목표. Spring Boot 프레임워크에서 MyBatis 라이브러리를 사용합니다. MyBatis를 사용하여 데이터베이스와의 CRUD(Create, Read, Update, Delete) 작업을 구현합니다. MyBatis를 이용한 데이터 CRUD 과정과 결과를 확인하고 스크린샷으로 제출. */

public class Mission02Application implements CommandLineRunner {

    @Autowired
    private ProductMapper productMapper;

    public static void main(String[] args) {
        SpringApplication.run(Mission02Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n---- MyBatis CRUD 작업 시작 ----");

        // 1. Create (INSERT)
        System.out.println("\n--- 1. 상품 삽입 (Create) ---");
        Product newProduct = new Product(
                0,
                "APP-001", "새로운 테스트 상품", new BigDecimal("25000.00"), 100,
                "Spring Boot와 MyBatis로 추가된 상품입니다.",
                "SKU-MYB001", "Electronics", LocalDate.of(2024, 5, 27),
                LocalTime.of(10, 0, 0), LocalDateTime.now(), null
        );
        int insertCount = productMapper.insertProduct(newProduct);
        System.out.println("삽입된 상품 수: " + insertCount + ", 자동 생성된 ID: " + newProduct.getProductId());
        System.out.println("삽입된 상품 정보: " + newProduct);


        // 2. Read (SELECT by ID)
        System.out.println("\n--- 2. 상품 ID로 조회 (Read by ID) ---");
        Product foundProduct = productMapper.selectProductById(newProduct.getProductId());
        System.out.println("조회된 상품 정보 (ID " + newProduct.getProductId() + "): " + foundProduct);


        // 3. Update (UPDATE)
        System.out.println("\n--- 3. 상품 정보 수정 (Update) ---");
        if (foundProduct != null) {
            foundProduct.setPrice(new BigDecimal("30000.00"));
            foundProduct.setStockQuantity(80);
            foundProduct.setDescription("업데이트된 상품 설명입니다.");
            int updateCount = productMapper.updateProduct(foundProduct);
            System.out.println("수정된 상품 수: " + updateCount);

            Product updatedProduct = productMapper.selectProductById(foundProduct.getProductId());
            System.out.println("수정 후 확인된 상품 정보: " + updatedProduct);
        }


        // 4. Read All (SELECT all)
        System.out.println("\n--- 4. 모든 상품 목록 조회 (Read All) ---");
        List<Product> allProducts = productMapper.selectAllProducts();
        System.out.println("현재 데이터베이스에 있는 총 상품 수: " + allProducts.size());
        allProducts.forEach(product -> System.out.println(" - " + product.getProductName() + " (ID: " + product.getProductId() + ")"));


        // 5. Delete (DELETE)
        System.out.println("\n--- 5. 상품 삭제 (Delete) ---");
        if (newProduct.getProductId() != 0) {
            int deleteCount = productMapper.deleteProduct(newProduct.getProductId());
            System.out.println("삭제된 상품 수: " + deleteCount + ", 삭제된 ID: " + newProduct.getProductId());

            Product deletedCheck = productMapper.selectProductById(newProduct.getProductId());
            System.out.println("삭제 확인 (null이어야 함): " + deletedCheck);
        }

        System.out.println("\n---- MyBatis CRUD 작업 완료 ----");
    }
}