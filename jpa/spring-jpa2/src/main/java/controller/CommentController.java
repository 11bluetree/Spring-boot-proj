package controller;

import com.example.springjpa2.model.Comment;
import com.example.springjpa2.repository.CommentRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    public final CommentRepository repository;

    // コンストラクタ
    // @Autowired // コンストラクタが1つの場合は省略可能
    public CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getAllComments(@ModelAttribute Comment comment, Model model) {

        // すべてのコメントを取得して表示する
        model.addAttribute("comments", repository.findAll());
        return "list";
    }

    @PostMapping("/add")
    public String addComment(@ModelAttribute @Validated Comment comment, BindingResult result,Model model){

        model.addAttribute("comments", repository.findAll());

        if(result.hasErrors()){
            return getAllComments(comment, model);
        }

        /* つぶやいたコメントを保存する。
        JPAなら基本操作メソッドが入っていて便利だね！！ */
        repository.save(comment);

        return "redirect:/";
    }

}
