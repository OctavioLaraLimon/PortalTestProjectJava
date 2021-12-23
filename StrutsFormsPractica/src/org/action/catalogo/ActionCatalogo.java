/**
 * 
 */
package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;

import org.dao.producto.DaoProducto_t;
import org.modelo.producto.PRODUCTO_T;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author ing Octavio Lara Limon
 *
 */
public class ActionCatalogo extends ActionSupport implements ModelDriven<PRODUCTO_T>{
	private PRODUCTO_T producto_t= new PRODUCTO_T();
	private DaoProducto_t dao= new DaoProducto_t();
	private List<PRODUCTO_T> producto_ts=new ArrayList<PRODUCTO_T>();
	private List<String> nombrePRODUCTO_T= new ArrayList<String>();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String catalogo() {
		setProducto_ts(dao.selectPRODUCTO_T());
		for(PRODUCTO_T x: producto_ts) {
			nombrePRODUCTO_T.add(x.getNombre());
		}
		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public PRODUCTO_T getModel() {
		// TODO Auto-generated method stub
		return producto_t;
	}

	public List<PRODUCTO_T> getProducto_ts() {
		return producto_ts;
	}

	public void setProducto_ts(List<PRODUCTO_T> producto_ts) {
		this.producto_ts = producto_ts;
	}

	public List<String> getNombrePRODUCTO_T() {
		return nombrePRODUCTO_T;
	}

	public void setNombrePRODUCTO_T(List<String> nombrePRODUCTO_T) {
		this.nombrePRODUCTO_T = nombrePRODUCTO_T;
	}
}
