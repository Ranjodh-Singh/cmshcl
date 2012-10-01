package org.democms.query;

import javax.persistence.*;

@Entity
@Table(name = "Worker")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "body")
	private String body;
	@Column(name = "disclaimer")
	private String disclaimer;
	@Column(name = "imageid")
	private int imageid;
	@Column(name = "imageurl")
	private String imageurl;

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public int getImageid() {
		return imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

}
