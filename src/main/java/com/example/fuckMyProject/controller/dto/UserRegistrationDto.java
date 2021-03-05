package com.example.fuckMyProject.controller.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.example.fuckMyProject.constraint.FieldMatch;
import lombok.Data;

@FieldMatch.List({
		@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
		@FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})
@Data
public class UserRegistrationDto {

	@NotEmpty(message = "First Name can not empty")
	private String firstName;

	@NotEmpty(message = "Last Name can not empty")
	private String lastName;

	@NotEmpty(message = "Password can not empty")
	private String password;

	@NotEmpty(message = "Confirm password can not empty")
	private String confirmPassword;

	@Email(message = "Email incorrect format")
	@NotEmpty(message = "Email can not empty")
	private String email;

	@Email(message = "Email incorrect format")
	@NotEmpty(message = "Confirm e-mail can not empty")
	private String confirmEmail;

	@AssertTrue(message = "Agree with term of conditions")
	private Boolean terms;
}
