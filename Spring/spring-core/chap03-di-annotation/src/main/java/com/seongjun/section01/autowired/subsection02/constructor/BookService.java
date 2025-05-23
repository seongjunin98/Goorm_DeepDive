package com.seongjun.section01.autowired.subsection02.constructor;

import com.seongjun.section01.common.BookDAO;
import com.seongjun.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service : @Component의 세분화 어노테이션의 한 종류로 Service 계층에서 사용한다. */
@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    /* BookDAO 타입의 빈 객체를 생성자에 자동으로 주입해준다. */
    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence){

        return bookDAO.selectOneBook(sequence);
    }
}

/* 생성자 주입의 `장점`
- 객체가 생성 될 때 모든 의존성이 주입 되므로 의존성을 보장할 수 있다.
    - `순환 참조` 에 대해 필드 주입/세터 주입은 메소드 실행 시점에 오류가 발생한다.
    - 생성자 주입은 어플리케이션 실행 시점에 오류가 발생한다.
- 객체의 불변성을 보장할 수 있다.
    - 필드에 `final` 사용 가능하고 객체 생성 이후 의존성을 변경할 수 없어 안정성이 보장 된다.
- 코드 가독성이 좋다.
    - 해당 객체가 어떤 의존성을 가지고 있는지 명확히 알 수 있다.
- DI 컨테이너와의 결합도가 낮기 때문에 테스트 하기 좋다.
    - 스프링 컨테이너 없이 테스트를 할 수 있다.
 */