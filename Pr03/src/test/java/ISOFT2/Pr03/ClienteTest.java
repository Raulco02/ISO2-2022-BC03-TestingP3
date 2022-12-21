package ISOFT2.Pr03;

import ISOFT2.Pr03.Cliente.ErrorException;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;


@SuppressWarnings("deprecation")
public class ClienteTest extends TestCase{
	
	@Test
	public void testeachUseTest() throws ErrorException{
		
		try {
		Cliente cliente = new Cliente(-17, true, true);
		cliente.asignarCuenta();
		}catch(ErrorException e){
			Assert.fail("Ha saltado una excepción");
		}
		
		Cliente cliente2 = new Cliente(14, false, false);
		String cuenta2 = cliente2.asignarCuenta();
		String expected2 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected2, cuenta2);
		
		Cliente cliente3 = new Cliente(20, true, true);
		String cuenta3 = cliente3.asignarCuenta();
		String expected3 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected3, cuenta3);
		
		Cliente cliente4 = new Cliente(50, true, true);
		String cuenta4 = cliente4.asignarCuenta();
		String expected4 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected4, cuenta4);
		
		try {
			Cliente cliente5 = new Cliente(0, false, false);
			cliente5.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
	
		Cliente cliente6 = new Cliente(18, false, false);
		String cuenta6 = cliente6.asignarCuenta();
		String expected6 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected6, cuenta6);
		
		Cliente cliente7 = new Cliente(25, true, true);
		String cuenta7 = cliente7.asignarCuenta();
		String expected7 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected7, cuenta7);
		
		try {
			Cliente cliente8 = new Cliente(120, true, true);
			cliente8.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente9 = new Cliente(130, true, true);
			cliente9.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		
	}
	
	@Test
	public void testpairWiseTest() throws ErrorException {

		Cliente cliente6 = new Cliente(20,false,true);
		String cuenta6 = cliente6.asignarCuenta();
		String expected6 = ("Cuenta Ahorra ahora que puedes");
		assertEquals(expected6, cuenta6);
		
		Cliente cliente7 = new Cliente(20,true,false);
		String cuenta7 = cliente7.asignarCuenta();
		String expected7 = ("Cuenta Vamos que tu puedes");
		assertEquals(expected7, cuenta7);
		
		Cliente cliente8 = new Cliente(20,false,false);
		String cuenta8 = cliente8.asignarCuenta();
		String expected8 = ("Cuenta Saltando del nido");
		assertEquals(expected8, cuenta8);
		
		Cliente cliente9 = new Cliente(50,true,true);
		String cuenta9 = cliente9.asignarCuenta();
		String expected9 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected9, cuenta9);
		
		Cliente cliente10 = new Cliente(50,true,false);
		String cuenta10 = cliente10.asignarCuenta();
		String expected10 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected10, cuenta10);
		
		Cliente cliente11 = new Cliente(50,false,true);
		String cuenta11 = cliente11.asignarCuenta();
		String expected11 = ("Cuenta Independizate que va siendo hora");
		assertEquals(expected11, cuenta11);
		
		Cliente cliente12 = new Cliente(50,false,false);
		String cuenta12 = cliente12.asignarCuenta();
		String expected12 = ("Cuenta Bienvenido a la vida adulta");
		assertEquals(expected12, cuenta12);
		
		try {
			Cliente cliente13 = new Cliente(-17, true, true);
			cliente13.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente14 = new Cliente(-17, false, true);
			cliente14.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente15 = new Cliente(-17, false, false);
			cliente15.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente16 = new Cliente(0, false, false);
			cliente16.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente17 = new Cliente(0, true, true);
			cliente17.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente18 = new Cliente(0, true, false);
			cliente18.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		Cliente cliente19 = new Cliente(18,true,true);
		String cuenta19 = cliente19.asignarCuenta();
		String expected19 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected19, cuenta19);
		
		Cliente cliente20 = new Cliente(18,true,false);
		String cuenta20 = cliente20.asignarCuenta();
		String expected20 = ("Cuenta Vamos que tu puedes");
		assertEquals(expected20, cuenta20);
		
		Cliente cliente21 = new Cliente(18,false,false);
		String cuenta21 = cliente21.asignarCuenta();
		String expected21 = ("Cuenta Saltando del nido");
		assertEquals(expected21, cuenta21);
		
		Cliente cliente22 = new Cliente(25,true,true);
		String cuenta22 = cliente22.asignarCuenta();
		String expected22 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected22, cuenta22);
		
		Cliente cliente23 = new Cliente(25,true,false);
		String cuenta23 = cliente23.asignarCuenta();
		String expected23 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected23, cuenta23);
		
		Cliente cliente24 = new Cliente(25,false,false);
		String cuenta24 = cliente24.asignarCuenta();
		String expected24 = ("Cuenta Bienvenido a la vida adulta");
		assertEquals(expected24, cuenta24);
		
		try {
			Cliente cliente25 = new Cliente(120, true, false);
			cliente25.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente26 = new Cliente(120, true, true);
			cliente26.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente27 = new Cliente(120, false, false);
			cliente27.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente28 = new Cliente(130, false, false);
			cliente28.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente28 = new Cliente(130, true, false);
			cliente28.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		try {
			Cliente cliente28 = new Cliente(130, true, true);
			cliente28.asignarCuenta();
			}catch(ErrorException e){
				Assert.fail("Ha saltado una excepción");
			}
		
		
		
	}
	
	@Test
	public void testMCDCTest() throws ErrorException {
		Cliente cliente1 = new Cliente(16,true,true);
		String cuenta1 = cliente1.asignarCuenta();
		String expected1 = ("Cuenta confort");
		assertEquals(expected1, cuenta1);

		Cliente cliente2 = new Cliente(16,true,false);
		String cuenta2 = cliente2.asignarCuenta();
		String expected2 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected2, cuenta2);

		Cliente cliente3 = new Cliente(16,false,true);
		String cuenta3 = cliente3.asignarCuenta();
		String expected3 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected3, cuenta3);

		Cliente cliente4 = new Cliente(16,false,false);
		String cuenta4 = cliente4.asignarCuenta();
		String expected4 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected4, cuenta4);

		Cliente cliente5 = new Cliente(22,true,true);
		String cuenta5 = cliente5.asignarCuenta();
		String expected5 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected5, cuenta5);

		Cliente cliente6 = new Cliente(22,false,true);
		String cuenta6 = cliente6.asignarCuenta();
		String expected6 = ("Cuenta Ahorra ahora que puedes");
		assertEquals(expected6, cuenta6);

		Cliente cliente7 = new Cliente(22,true,false);
		String cuenta7 = cliente7.asignarCuenta();
		String expected7 = ("Cuenta Vamos que tu puedes");
		assertEquals(expected7, cuenta7);

		Cliente cliente8 = new Cliente(22,false,false);
		String cuenta8 = cliente8.asignarCuenta();
		String expected8 = ("Cuenta Saltando del nido");
		assertEquals(expected8, cuenta8);

		Cliente cliente9 = new Cliente(26,true,true);
		String cuenta9 = cliente9.asignarCuenta();
		String expected9 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected9, cuenta9);

		Cliente cliente10 = new Cliente(26,true,false);
		String cuenta10 = cliente10.asignarCuenta();
		String expected10 = ("No hay ninguna cuenta para ti :(");
		assertEquals(expected10, cuenta10);

		Cliente cliente11 = new Cliente(26,false,true);
		String cuenta11 = cliente11.asignarCuenta();
		String expected11 = ("Cuenta Independizate que va siendo hora");
		assertEquals(expected11, cuenta11);

		Cliente cliente12 = new Cliente(26,false,false);
		String cuenta12 = cliente12.asignarCuenta();
		String expected12 = ("Cuenta Bienvenido a la vida adulta");
		assertEquals(expected12, cuenta12);
	}
	
	
	
	@Test
	public void testdecisionCoverageTest() throws ErrorException {
		//Decision 1
		//Para true
		Cliente cliente = new Cliente(14, true, true);
		String cuenta = cliente.asignarCuenta();
		String expected = "Cuenta confort";
		assertEquals(expected, cuenta);
		
		//Para false
		Cliente cliente2 = new Cliente(20, false, false);
		String cuenta2 = cliente2.asignarCuenta();
		String expected2 = "Cuenta Saltando del nido";
		assertEquals(expected2, cuenta2);
		
		//Decision 2
		//Para true
		Cliente cliente3 = new Cliente(20, true, false);
		String cuenta3 = cliente3.asignarCuenta();
		String expected3 = "Cuenta Vamos que tu puedes";
		assertEquals(expected3, cuenta3);
		
		//Para false
		Cliente cliente4 = new Cliente(27, false, true);
		String cuenta4 = cliente4.asignarCuenta();
		String expected4 = "Cuenta Independizate que va siendo hora";
		assertEquals(expected4, cuenta4);
		
		
		//Decision 3
		//Para true
		Cliente cliente5 = new Cliente(20, false, true);
		String cuenta5 = cliente5.asignarCuenta();
		String expected5 = "Cuenta Ahorra ahora que puedes";
		assertEquals(expected5, cuenta5);
		
		//Para false
		Cliente cliente6 = new Cliente(27, true, false);
		String cuenta6 = cliente6.asignarCuenta();
		String expected6 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected6, cuenta6);
		
		
		//Decision 4
		//Para true
		Cliente cliente7 = new Cliente(14, false, false);
		String cuenta7 = cliente7.asignarCuenta();
		String expected7 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected7, cuenta7);
		
		//Para false
		Cliente cliente8 = new Cliente(27, true, true);
		String cuenta8 = cliente8.asignarCuenta();
		String expected8 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected8, cuenta8);
		
		//Decision 5
		//Para true
		Cliente cliente9 = new Cliente(27, false, true);
		String cuenta9 = cliente9.asignarCuenta();
		String expected9 = "Cuenta Independizate que va siendo hora";
		assertEquals(expected9, cuenta9);
		
		//Para false
		Cliente cliente10 = new Cliente(14, true, false);
		String cuenta10 = cliente10.asignarCuenta();
		String expected10 = "No hay ninguna cuenta para ti :(";
		assertEquals(expected10, cuenta10);
		
		
		//Decision 6
		//Para true
		Cliente cliente11 = new Cliente(27, false, false);
		String cuenta11 = cliente11.asignarCuenta();
		String expected11 = "Cuenta Bienvenido a la vida adulta";
		assertEquals(expected11, cuenta11);
		
		//Para false
		Cliente cliente12 = new Cliente(14, true, true);
		String cuenta12 = cliente12.asignarCuenta();
		String expected12 = "Cuenta confort";
		assertEquals(expected12, cuenta12);
		
		
	}
	
}
