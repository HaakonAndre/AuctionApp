package rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import ejb.RestPopulate;
import entities.Address;



@Path("/kake")
@Stateless
public class KakeService {

	@PersistenceContext(unitName = "AuctionApp")
	private EntityManager em;
	
	
	@EJB
	RestPopulate add;
	
	@GET
	@Produces("text/plain")
	public String getKake() {
/*
		ad.setCity("Bergen");
		ad.setStreet("Tordenskjoldsgate 2");
		ad.setPostnumber(5031);
		add.persist(ad);
		*/
		
		return "kake";
	}
}
