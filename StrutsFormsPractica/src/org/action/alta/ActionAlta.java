/**
 * 
 */
package org.action.alta;

import org.dao.producto.DaoProducto_t;
import org.modelo.producto.PRODUCTO_T;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author ing Octavio Lara Limon
 *
 */
public class ActionAlta extends ActionSupport implements ModelDriven<PRODUCTO_T>{
	private PRODUCTO_T producto=new PRODUCTO_T();
	private DaoProducto_t dao=new DaoProducto_t();
	
	public String Execute() {
		return SUCCESS;
	}
	
	public String addPRODUCTO_T() {
		dao.addPRODUCTO_T(producto);
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public PRODUCTO_T getModel() {
		// TODO Auto-generated method stub
		return producto;
	}
	
	

}
