/**
 * 
 */
package org.action.consulta;

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
public class ActionConsulta extends ActionSupport implements ModelDriven<PRODUCTO_T>{
	private PRODUCTO_T producto_t=new PRODUCTO_T();
	private DaoProducto_t dao=new DaoProducto_t();
	private List<PRODUCTO_T> listPRODUCTO_T=new ArrayList<PRODUCTO_T>();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String selectPRODUCTO_T() {
		setListPRODUCTO_T(dao.selectPRODUCTO_T());
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

	public List<PRODUCTO_T> getListPRODUCTO_T() {
		return listPRODUCTO_T;
	}

	public void setListPRODUCTO_T(List<PRODUCTO_T> listPRODUCTO_T) {
		this.listPRODUCTO_T = listPRODUCTO_T;
	}
	
	
	
	

}
