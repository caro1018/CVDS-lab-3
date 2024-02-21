package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest
{
    private CalculadorDescuentos calDesc = new CalculadorDescuentos();
    private double tarifa;

    @Test
    public void validateInvalidAge()
    {
        tarifa = calDesc.calculoTarifa(2000, 21, -1);

        Assert.assertTrue(tarifa != 999);
    }

    @Test
    public void validateDays()
    {
        this.validateParmsValids(2000, 21, 1, 1600);
        this.validateParmsValids(2000, 21, 17, 1600);
        this.validateParmsValids(2000, 21, 18, 1700);
        this.validateParmsValids(2000, 21, 66, 1540);
        this.validateParmsValids(2000, 1, 1, 1900);
        this.validateParmsValids(2000, 19, 17, 1900);
        this.validateParmsValids(2000, 1, 18, 2000);
        this.validateParmsValids(2000, 19, 64, 2000);
        this.validateParmsValids(2000, 1, 66, 1840);
        this.validateParmsValids(2000, 19, 136, 1840);

        this.validateParmsInValids(2000, 21, -1, 1600);
        this.validateParmsInValids(2000, 21, -17, 1600);
        this.validateParmsInValids(1700, -2, 18, 1700);
        this.validateParmsInValids(0, -21, 66, 1540);
        this.validateParmsInValids(2000, -1, 1, 1900);
        this.validateParmsInValids(0, 19, 17, 1900);
        this.validateParmsInValids(2000, 1, -18, 1900);
    }


    public void validateParmsValids(double _tarifa, int _days, int _age, double _Total)
    {
        tarifa = calDesc.calculoTarifa(_tarifa, _days, _age);
        Assert.assertTrue(tarifa == _Total);
    }

    public void validateParmsInValids(double _tarifa, int _days, int _age, double _Total)
    {
        if(_tarifa <= 0)
        {
            Assert.assertFalse(false);
        }
        else {
            tarifa = calDesc.calculoTarifa(_tarifa, _days, _age);
            Assert.assertFalse(tarifa != _Total);
        }
    }


}
