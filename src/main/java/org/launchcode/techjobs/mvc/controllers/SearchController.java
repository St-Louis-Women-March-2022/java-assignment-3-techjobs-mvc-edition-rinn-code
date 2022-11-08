package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
    @PostMapping
    public String displaySearchResults(String searchType, String searchTerm, Model model) {
        model.addAttribute("searchType", searchType);
        model.addAttribute("searchTerm", searchTerm);
        return("search");


//    <ol th:if = "${coffeeOptions.size() > 1}">
//   <li th:each="item : ${coffeeOptions}" th:text="${item}"></li>
//</ol>
//
//<h2 th:if = '${userSelection.equals("instant")}'>You can do better!</h2>

//    If the user enters “all” in the search box, or if they leave the box empty, call the findAll() method from JobData.
//    Otherwise, send the search information to findByColumnAndValue.
//    In either case, store the results in a jobs ArrayList.
//    Pass jobs into the search.html view via the model parameter.
//    Pass ListController.columnChoices into the view, as the existing search handler does

   }

}
