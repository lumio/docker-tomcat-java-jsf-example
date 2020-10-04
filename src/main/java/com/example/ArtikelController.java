package com.example;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@ViewScoped
public class ArtikelController {

  private int index = 0;
  private Artikel neuerArtikel = null;

  public String add() {
    return "edit";
  }

  public Artikel getNeuerArtikel() {
    if (neuerArtikel == null) {
      this.neuerArtikel = new Artikel();
    }
    return this.neuerArtikel;
  }

  public String save() {
    Shop.getInstance().saveArtikel(neuerArtikel);
    return null;
  }

  public String cancel() {
    return "index";
  }

  public Artikel getArtikel() {
    return Shop.getInstance().getSortiment().get(index);
  }

  public void vor(){
    if (index < Shop.getInstance().getSortiment().size()-1) {
      index++;
    }
  }

  public void zurueck(){
    if (index > 0) {
      index--;
    }
  }

  public int getIndex() {
    return index;
  }

  // public void validateTestField(FacesContext context, UIComponent component, Object value) throws ValidatorException {
  //   String testField = (String) value;
  //   System.out.println(testField);
  //   if (!testField.endsWith("bar")) {
  //     throw new ValidatorException(
  //             new FacesMessage(FacesMessage.SEVERITY_ERROR, "should end with bar", "some details")
  //     );
  //   }
  // }

}
