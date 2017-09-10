package wz.learning.io.angularbootsample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wz.learning.io.angularbootsample.domain.Bike;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BikeController {

    List<Bike> bikes = null;

    @GetMapping("/api/allbikes")
    @CrossOrigin("http://localhost:4200")
    public List<Bike> getAllBikes(){
        createBikes();
        return bikes;
    }

    private void createBikes() {
        bikes = new ArrayList<>();
        bikes.add(Bike.build("x100" , "harley"));
        bikes.add(Bike.build ("x200" , "suzuki"));
    }


}
