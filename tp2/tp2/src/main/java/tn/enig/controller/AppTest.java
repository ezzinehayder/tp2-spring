package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.IMagasinDao;
import tn.enig.dao.IProduitDao;
import tn.enig.model.Magasin;
import tn.enig.model.Produit;




@Controller
public class AppTest {

	@Autowired
	private IProduitDao daop;
	public void setDaop(IProduitDao daop) {
		this.daop=daop;
	}
	@Autowired
	private IMagasinDao daom;
	public void setDaom(IMagasinDao daom) {
		this.daom=daom;
	}
	
	@GetMapping("/home")
	public String get1(Model m) {
		List<Magasin> liste1=daom.findAll();
		m.addAttribute("listem",liste1);
		return "listm";
	}
	
	@GetMapping("/listP")
	public String get2(Model m) {
		List<Produit> liste1=daop.findAll();
		m.addAttribute("listep",liste1);
		return "listp";
	}
	
	 @GetMapping("/ajoutProduit")
	 	public String get4(Model m) {
	 	Produit p=new Produit();
	 	List<Magasin> listmag= daom.findAll();
	 	
	 	m.addAttribute("listmag", listmag);
	 	m.addAttribute("p", p);

			return "ajout";
		}
		 
		@PostMapping("/saveProduit") 
		public String get5(Model m ,@ModelAttribute("p") Produit p) {
			daop.save(p);
			return "redirect:/home";
		 
		}
		@GetMapping("/produit/{id}")
		public String get6(Model m, @PathVariable("id") int id) {
			List<Produit>liste2=daop.getProdByMag(id);
			m.addAttribute("liste",liste2);
			return "ProduitMag";}

}
