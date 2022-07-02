package ClassRoom;

import ClassRoom.Pupil;

public class GoodPupil extends Pupil {

    GoodPupil(String michelangelo, String leonardo, String raphael, String donatello) {
        super(michelangelo, leonardo, raphael, donatello);
    }

    @Override
    public void relax() {
        super.relax();
    }

    @Override
    public void write() {
        super.write();
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void study() {
        super.study();
    }
}
