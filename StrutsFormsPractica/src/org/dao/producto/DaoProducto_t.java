/**
 * 
 */
package org.dao.producto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.producto.PRODUCTO_T;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.sun.media.jfxmedia.control.VideoDataBuffer;

/**
 * @author ing Octavio Lara Limon
 *
 */
public class DaoProducto_t {
	@SessionTarget
	private Session session;
	@TransactionTarget
	private Transaction transaction;
	
	public void addPRODUCTO_T(PRODUCTO_T producto) {
		try {
			session.save(producto);
		} catch (Exception e) {
			System.out.println("Exception"+e.getMessage());
		}
		
	}
	
	public List<PRODUCTO_T> selectPRODUCTO_T() {
		List<PRODUCTO_T> list=null;
		try {
			list=(List<PRODUCTO_T>) session.createQuery("from PRODUCTO_T").list();
		} catch (Exception e) {
			System.out.println("Exception"+e.getMessage());
		}
		return list;
	}
	

}
