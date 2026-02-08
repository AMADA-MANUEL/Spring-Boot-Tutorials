package Spring.Tutorial.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("SoftwareEnigneer")
public class SoftwareEngineerController {
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js,node,react,tailwindcss"
                ),
                new SoftwareEngineer(
                        2,
                        "Lindho",
                        "java,python,git,springboot"
                )

        );
    }

}
