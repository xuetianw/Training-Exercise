package fdm.controller;

import fdm.model.Validator;
import fdm.view.View;

import java.util.List;

public class LoginController {
	private View view;
	private Validator validator;
	
	public LoginController(View view, Validator validator) {
		super();
		this.view = view;
		this.validator = validator;
	}

	public boolean handle() {
		String ui = view.getUserInput();
		return validator.validate(ui);
	}
	
	
}
