package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.entity.Display;

import java.util.List;

public interface DisplayRepository extends JpaRepository<Display, Long> {
    List<Display> findByDisplayNmOrDisplayDetail(String displayNm,String displayDetail);
    List<Display> findByPriceLessThan(Integer price);
}
