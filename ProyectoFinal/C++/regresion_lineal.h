#ifndef REGRESION_LINEAL_H
#define REGRESION_LINEAL_H

#include <vector>

class RegresionLineal {
public:
    RegresionLineal();
    void entrenar(const std::vector<double>& x, const std::vector<double>& y);
    double predecir(double valor);
    double calcularMSE(const std::vector<double>& x, const std::vector<double>& y);

private:
    double pendiente;
    double intercepto;
};

#endif

