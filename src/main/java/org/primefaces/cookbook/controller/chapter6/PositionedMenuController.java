package org.primefaces.cookbook.controller.chapter6;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 * PositionedMenuController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class PositionedMenuController implements Serializable {

	public void save(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void update(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Updated", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void delete(ActionEvent ae) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Deleted", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String doSomething() {
		// do something
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Done", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);

		return null;
	}
}
