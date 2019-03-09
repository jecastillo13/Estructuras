
public class parcial {
	public static void main(String[] args) {

	}
	public static int calcular(int rutas, int conductores,int tiempo,int valorextras) {
		int horaspagadas = 0;
		int tiempolimite;
		int numerorutas;
		if (rutas==conductores&& rutas>=tiempo) {
			tiempolimite= tiempo/rutas;
			if (rutas>tiempo) {
				horaspagadas=(tiempolimite-tiempo)*valorextras;
			}
		}
		if (conductores < rutas) {
			numerorutas=rutas/conductores;
			tiempolimite= tiempo/rutas;
			if (rutas>tiempo) {
				horaspagadas=(tiempolimite-tiempo)*valorextras;
			} else {
				numerorutas=conductores/rutas;
				tiempolimite= tiempo/rutas;
				if (rutas>tiempo) {
					horaspagadas=(tiempolimite-tiempo)*valorextras;
				}


				

			}
		}
		return horaspagadas;
	}
}

