package csu.bonusassignment.Controllers;

import csu.bonusassignment.dbentities.Employee;
import csu.bonusassignment.model.Search;
import csu.bonusassignment.repositories.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class DefaultController {
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("Employees", employeeRepo.findAll());
            return "index";
    }

    @PostMapping("")
    public String loginToDashboard(@ModelAttribute Search search,
                                   Model model) {
        List<Employee> employees = employeeRepo.searchEmployeeByLastName(search.getLastName());
        model.addAttribute("Employees", employees);
        return "index";
    }

    @GetMapping("reset")
    public String reset(Model model) {
        model.addAttribute("Employees", employeeRepo.findAll());
        return "index";
    }
}
