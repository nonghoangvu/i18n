package vn.author;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AuthorInfo {
    @PostConstruct
    public void showAuthor() {
        System.out.println("Nong Hoang Vu");
    }
}