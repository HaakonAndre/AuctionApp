package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int price;
	
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Category category;
	
	private boolean published;
	
	private boolean sold;
	
	//private Date timelimit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="PERSON_ID")
	private Person person;
	

	@OneToMany(mappedBy="product", cascade = CascadeType.ALL)
	private List<Bid> bid = new ArrayList<>();
	
	public Product() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

//	public Date getTimelimit() {
//		return timelimit;
//	}
//
//	public void setTimelimit(Date timelimit) {
//		this.timelimit = timelimit;
//	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Bid> getBid() {
		return bid;
	}

	public void setBid(List<Bid> bid) {
		this.bid = bid;
	}
	
	public void addBid(Bid bids) {
		bid.add(bids);
		bids.setProduct(this);
	}
	


	
	
 
}