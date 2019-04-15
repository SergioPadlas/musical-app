package android.example.musicalapp;

public class Albun {

    private String mDefaultAlbun;
    private String mDefaultArtista;

    public Albun (String defaultAlbun, String defaultArtista) {
        mDefaultAlbun = defaultAlbun;
        mDefaultArtista = defaultArtista;
    }

        public String getDefaultAlbun(){
            return mDefaultAlbun;
        }
        public String getDefaultArtista(){
            return mDefaultArtista;
        }


}
