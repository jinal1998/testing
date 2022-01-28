package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paymentplans 
{
@JsonProperty("Title")
private String title;
@JsonProperty("Description")
private String description;
@JsonProperty("Image")
private String image;
@JsonProperty("Button")
private String button1;


public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


public String getButton1() {
	return button1;
}
public void setButton1(String button1) {
	this.button1 = button1;
}

}


