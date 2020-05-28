package com.google.buscador.venta.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.buscador.util.ConectaDB;
import com.google.buscador.venta.bean.ComputadoraBean;
import com.google.buscador.venta.bean.MarcaBean;

public class MySqlComputadoraDAO implements ComputadoraDAO{

	@Override
	public int insertaComputadora(ComputadoraBean obj) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		int insertados = -1;
		try {
			String sql = "insert into computadora values(null,?,?,?,?)";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, obj.getNombre());
			pstm.setDouble(2, obj.getPrecio());
			pstm.setInt(3, obj.getStock());
			pstm.setInt(4, obj.getMarca().getIdMarca());
			
			insertados = pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (pstm != null)pstm.close();
			} catch (SQLException e1) {}
			try {
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return insertados;
	}

	@Override
	public List<MarcaBean> listaMarca() throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<MarcaBean> lista = new ArrayList<MarcaBean>();
		try {
			String sql = "select * from marca";
			conn = new ConectaDB().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			MarcaBean bean = null;
			while(rs.next()){
				bean = new MarcaBean();
				bean.setIdMarca(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				lista.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return lista;
	}

	
	
}
