package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Controller
@Data
@RequestMapping("/book")
public class BookController {
//
//	@Autowired
//	BookService bookService;
//
//	@Autowired
//	private AppConfig appConfig;
//
//	@GetMapping("/bookinfo")
//	public String bookInfo(Model model) {
//		model.addAttribute("BookList", bookService.findBook());
//		return "bookinfo";
//	}
//
//	//アクセス時に本を一覧で取得
//	@GetMapping("/list")
//	public String getBookList(@AuthenticationPrincipal CustomDetails user_info, Model model) {
//		
//		int rental_key_id = user_info.getUserList().getUser_id();
//		
//		model.addAttribute("BookList", bookService.getBookList(rental_key_id));
//		//System.out.println(user_role);
//		return "booklist";
//	}
//
//	@GetMapping("/editview/{book_id}")
//	public String moveEditView(@PathVariable int book_id, Model model) {
//		model.addAttribute("TargetBook", bookService.targetBook(book_id));
//		return "bookedit";
//	}
//
//	@GetMapping("/createview")
//	public String moveCreateView(Model model) {
//		return "bookcreate";
//	}
//
//	@PostMapping("/bookcreate")
//	public String createBook(@ModelAttribute("createBook") BookList bookList, Model model) {
//
//		//ファイル名の決定のためDBのレコード数を取得(book_idにしようと思ったがユニークキーが存在しないため不可能)
//		int max_number_book = bookService.getMaxNumberBook();
//
//		String tmp_file_name = String.valueOf(max_number_book + 1) + ".jpg";
//
//		bookList.setFile_name(tmp_file_name);
//		//System.out.println(bookList);
//		//DBに登録処理
//		bookService.createBook(bookList);
//
//		//		System.out.println(file);
//		//ファイルの保存処理
//		if (bookList.getFile().isEmpty()) {
//			model.addAttribute("error", "ファイルを指定してください");
//			return "imagetest";
//		}
//		File dest = new File(appConfig.getImageDir(), tmp_file_name);
//		System.out.println(dest);
//		try {
//			bookList.getFile().transferTo(dest); //表示される修正候補の「try/catchで囲む」を選択
//		} catch (IllegalStateException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//		return "redirect:/book/list";
//	}
//
//	@PostMapping("/bookedit")
//	public String editBook(@ModelAttribute("editBook") BookList bookList) {
//		System.out.println(bookList);
//		bookService.editBook(bookList);
//		return "redirect:/book/list";
//	}
//
//	@GetMapping("/bookdelete/{book_id}")
//	public String deleteBook(@PathVariable int book_id) {
//		//System.out.println(book_id);
//		bookService.deleteBook(book_id);
//		return "redirect:/book/list";
//	}
//
//	@GetMapping("/details/{book_id}")
//	public String details(@PathVariable int book_id, Model model) {
//		model.addAttribute("TargetBook", bookService.targetBook(book_id));
//		return "bookdetails";
//	}

}
