package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
@Service
public class PressService {
    @Autowired
    private PressRepository pressRepository;
    @PostConstruct
    public void init() {
        // 预先存储一篇文章
        Press press = new Press(1L, "Sample Title", "Sample Content");
        pressRepository.save(press);
    }
    public Press getPressById(Long id) {
        return pressRepository.findById(id).orElse(null);
    }
}
