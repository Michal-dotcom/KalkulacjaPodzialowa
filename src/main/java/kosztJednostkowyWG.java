public class kosztJednostkowyWG extends daneObliczeniowe{
    public double kosztJednostkowyWG(String poziomWyceny, boolean materiały) {
        double kosztJednostkowyWG;

        if (poziomWyceny == "mat. b." && materiały == true) {
            kosztJednostkowyWG = (getMatBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) + ((getPłaceBezpośrednie() + getKosztyWydziałowe()) / getIlośćWG());
        } else if (poziomWyceny == "mat. b" && materiały == false) {
            kosztJednostkowyWG = (getMatBezpośrednie() / (getIlośćWG() + getIlośćRK())) + ((getPłaceBezpośrednie() + getKosztyWydziałowe() / getIlośćWG()));
        } else if (poziomWyceny == "k. b." && materiały == true) {
            kosztJednostkowyWG = (getMatBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) +
                    (getPłaceBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) +
                    (getKosztyWydziałowe() / getIlośćWG());
        } else if (poziomWyceny == "k. b." && materiały == false) {
            kosztJednostkowyWG = (getMatBezpośrednie() + getPłaceBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) +
                    (getKosztyWydziałowe() / getIlośćWG());
        } else if (poziomWyceny == "k. w." && materiały == true) {
            kosztJednostkowyWG = (getMatBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) +
                    ((getPłaceBezpośrednie() + getKosztyWydziałowe()) / (getIlośćWG() + getIlośćRK() * getPrzeróbRK()));
        } else {
            kosztJednostkowyWG = (getMatBezpośrednie() / (getIlośćWG() + getIlośćRK() * getPrzeróbRK())) +
                    ((getPłaceBezpośrednie() + getKosztyWydziałowe()) / (getIlośćWG() + getIlośćRK() * getPrzeróbRK()));
        }


        return kosztJednostkowyWG;
    }
}
