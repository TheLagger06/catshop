package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author Your Name
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
	private static final long serialVersionUID = 1L;

	  public boolean add( Product pr ) //Adds items to basket
	  {       
		  for(int index=0;index<size();index++) //Checks if there is any of the product already in basket, if so +1 to quantity
		  {
			  if (get(index).getProductNum().equals(pr.getProductNum()))
			  {
				  get(index).setQuantity(get(index).getQuantity()+pr.getQuantity());
				  return true;
			  }
		  }
		  super.add(pr);
		  Collections.sort(this, BetterBasket::arrange);
		  return true;
	  }
	  public static int arrange(Product a, Product b) //Puts items in numeric order using the product numbers
	  {
		  return a.getProductNum().compareTo(b.getProductNum());
	  }

  // You need to add code here
  }
