package vn.edu.iuh.fit.frontend.controllers;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backend.enums.SkillType;
import vn.edu.iuh.fit.backend.models.Address;
import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.backend.services.CandidateServices;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/list")
    public String showCandidateList(Model model){
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/candidates";
    }

    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Candidate> candidatePage= candidateServices.findAll(
                currentPage - 1,pageSize,"id","asc");
        model.addAttribute("candidatePage", candidatePage);
        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "candidates/candidate-paging";
    }
    @GetMapping("/add")
    public String add(Model model){
        Address address  =new Address();
        Candidate candidate = new Candidate();
        candidate.setAddress(address);

        model.addAttribute("address",address);
        model.addAttribute("candidate",candidate);
        model.addAttribute("country",CountryCode.values());
        return "candidates/addCandidate";

    }

    @Transactional
    @PostMapping("/add")
    public String addCandidate(
            @ModelAttribute("candidate") Candidate candidate,
            @ModelAttribute("address") Address address
    ){
        addressRepository.save(address);
        candidate.setAddress(address);
        candidateRepository.save(candidate);
        return "redirect:candidates";
    }

    @GetMapping("/search")
    public String findCanByType(Model model){
        model.addAttribute("type", SkillType.values());
        return "candidates/search";
    }

}
