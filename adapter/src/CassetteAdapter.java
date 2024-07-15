public class CassetteAdapter implements MediaPlayer{
    private CassetePlayer casssetteplayer ;
    public CassetteAdapter(CassetePlayer casssetteplayer)
    {
        this.casssetteplayer=casssetteplayer;
    }

    @Override
    public void play(String audiotype, String Filename) {
        if (audiotype.equalsIgnoreCase("Cassete"))
        {
            casssetteplayer.PlayCasste(Filename);
        }
    }
}
