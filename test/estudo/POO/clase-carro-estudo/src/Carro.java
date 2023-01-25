class Carro {
  
  String cor, modelo;
  int capacidadeTanque;

  Carro(){
  
  }

  Carro(String color, String mod, int capacidadTanque){
    this.cor = color;
    this.modelo = mod;
    this.capacidadeTanque = capacidadTanque;
  }

  void setCor(String color){
    this.cor = color;
  }
  String getCor(){
    return cor;
  }
  void setModelo(String modelo){
    this.modelo = modelo;
  }
  String getModelo(){
    return modelo;
  }
  void setCapacidade(int capacidadeTanque){
    this.capacidadeTanque = capacidadeTanque;
  }
  int getCapacidade(){
    return capacidadeTanque;
  }
  double valorTotal(double valorCombustible){
    return capacidadeTanque * valorCombustible;
  }
}

