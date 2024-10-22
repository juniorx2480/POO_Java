#include "regresion_lineal.h"
#include <numeric>
#include <cmath>

RegresionLineal::RegresionLineal() : pendiente(0.0), intercepto(0.0) {}

void RegresionLineal::entrenar(const std::vector<double>& x, const std::vector<double>& y) {
    int n = x.size();
    double sumaX = std::accumulate(x.begin(), x.end(), 0.0);
    double sumaY = std::accumulate(y.begin(), y.end(), 0.0);
    double sumaXY = 0.0, sumaX2 = 0.0;

    for (int i = 0; i < n; ++i) {
        sumaXY += x[i] * y[i];
        sumaX2 += std::pow(x[i], 2);
    }

    pendiente = (n * sumaXY - sumaX * sumaY) / (n * sumaX2 - std::pow(sumaX, 2));
    intercepto = (sumaY - pendiente * sumaX) / n;
}

double RegresionLineal::predecir(double valor) {
    return pendiente * valor + intercepto;
}

double RegresionLineal::calcularMSE(const std::vector<double>& x, const std::vector<double>& y) {
    double mse = 0.0;
    for (int i = 0; i < x.size(); ++i) {
        mse += std::pow(predecir(x[i]) - y[i], 2);
    }
    return mse / x.size();
}

