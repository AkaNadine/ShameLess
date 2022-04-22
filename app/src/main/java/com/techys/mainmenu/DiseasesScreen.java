package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;


public class DiseasesScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        TextView mtitleDiseases = (TextView) findViewById(R.id.titleDiseases);

        TextView mtitleDisease1 = (TextView) findViewById(R.id.titleDisease1);
        TextView msymptoms1 = (TextView) findViewById(R.id.symptomsDisease1);
        TextView mtreatment1 = (TextView) findViewById(R.id.treatmentDisease1);
        TextView mtitleDisease2 = (TextView) findViewById(R.id.titleDisease2);
        TextView msymptoms2 = (TextView) findViewById(R.id.symptomsDisease2);
        TextView mtreatment2 = (TextView) findViewById(R.id.treatmentDisease2);
        TextView mtitleDisease3 = (TextView) findViewById(R.id.titleDisease3);
        TextView msymptoms3 = (TextView) findViewById(R.id.symptomsDisease3);
        TextView mtreatment3 = (TextView) findViewById(R.id.treatmentDisease3);
        TextView mtitleDisease4 = (TextView) findViewById(R.id.titleDisease4);
        TextView msymptoms4 = (TextView) findViewById(R.id.symptomsDisease4);
        TextView mtreatment4 = (TextView) findViewById(R.id.treatmentDisease4);
        TextView mtitleDisease5 = (TextView) findViewById(R.id.titleDisease5);
        TextView msymptoms5 = (TextView) findViewById(R.id.symptomsDisease5);
        TextView mtreatment5 = (TextView) findViewById(R.id.treatmentDisease5);
        TextView mtitleDisease6 = (TextView) findViewById(R.id.titleDisease6);
        TextView msymptoms6 = (TextView) findViewById(R.id.symptomsDisease6);
        TextView mtreatment6 = (TextView) findViewById(R.id.treatmentDisease6);
        TextView mtitleDisease7 = (TextView) findViewById(R.id.titleDisease7);
        TextView msymptoms7 = (TextView) findViewById(R.id.symptomsDisease7);
        TextView mtreatment7 = (TextView) findViewById(R.id.treatmentDisease7);
        TextView mtitleDisease8 = (TextView) findViewById(R.id.titleDisease8);
        TextView msymptoms8 = (TextView) findViewById(R.id.symptomsDisease8);
        TextView mtreatment8 = (TextView) findViewById(R.id.treatmentDisease8);
        TextView mtitleDisease9 = (TextView) findViewById(R.id.titleDisease9);
        TextView msymptoms9 = (TextView) findViewById(R.id.symptomsDisease9);
        TextView mtreatment9 = (TextView) findViewById(R.id.treatmentDisease9);
        TextView mprevention = (TextView) findViewById(R.id.prevention);
        TextView mabtprevention = (TextView) findViewById(R.id.abtPrevention);
        mtitleDiseases.setText("Diseases\n\n");
        StringBuilder stringBuilder = new StringBuilder();
        mtitleDisease1.setText("Gonorrhea\n\n");
        msymptoms1.setText("Symptoms: burning during urination, yellow or green discharge\n" +
                "If it’s left untreated, gonorrhea can lead to HIV\n");
        mtreatment1.setText("Treatment: can usually be treated with 2 medications regimen or dual therapy\n\n\n");

        mtitleDisease2.setText("Syphilis\n\n");
        msymptoms2.setText("Symptoms: abnormal bulging of the large vessel leaving the heart , resulting in heart problems, the development of large nodules in various organs of the body, infection of the brain, causing a stroke, mental confusion, involvement of the eyes leading to sight deterioration, involvement of the ears resulting in deafness\n");
        mtreatment2.setText("Treatment: long-acting penicillin injections have been very effective in treating both early and late-stage syphilis\n\n\n");

        mtitleDisease3.setText("HIV\n\n");
        msymptoms3.setText("Symptoms: Symptoms: symptoms include fever, rash, sore throat, and swollen lymph nodes. Symptoms worsen as HIV progresses.\n" +
                "HIV is thought to occur more frequently in men who have sex with men because of the additional risk of transmission from anal sex.\n");
        mtreatment3.setText("Treatment: HIV isn’t curable, but it can be treated by several classes of drugs that stop the virus from copying itself and taking over body cells.\n\n\n");

        mtitleDisease4.setText("Candidiasis\n\n");
        msymptoms4.setText("Symptoms: itching and irritation in the vagina and vulva.A burning sensation, especially during intercourse or while urinating.Redness and swelling of the vulva.Vaginal pain and soreness.Vaginal rash.Thick, white, odor-free vaginal discharge with a cottage cheese appearance.Watery vaginal discharge.\n");
        mtreatment4.setText("Treatment: For most adults, the initial recommended antifungal treatment is an echinocandin (caspofungin, micafungin, or anidulafungin) given through the vein (intravenous or IV). Fluconazole, amphotericin B, and other antifungal medications may also be appropriate in certain situations.\n\n\n");

        mtitleDisease5.setText("Chlamydia\n\n");
        msymptoms5.setText("Symptoms: pain when urinating, pain in the lower abdomen, and penile discharge." +
                " Most people don’t experience symptoms that’s why regularly going to a doctor control can help keeping you safe\n");
        mtreatment5.setText("Treatment: it is treated with an antibiotic regimen, and you can usually recover within a week\n\n\n");

        mtitleDisease6.setText("Genital Herpes\n\n");
        msymptoms6.setText("Symptoms: they include itching and pain tiny fluid-filled or red-colored bumps, and ulcers that may eventually leave scabs.\n");
        mtreatment6.setText("Treatment: antiviral medications, such as acyclovir and valacyclovir, can treat outbreaks. But, no cure currently exists for herpes.\n\n\n");

        mtitleDisease7.setText("HPV\n\n");
        msymptoms7.setText("Symptoms: Symptoms include small areas of swelling around the penis (in the case of genital warts), cauliflower-shaped warts, and itching around the penis." +
                "There’s currently no recommended HPV test for men\n");
        mtreatment7.setText("Treatment: Genital warts are usually treated with a medication that’s applied to the warts. However, they can also be removed surgically.\n\n\n");

        mtitleDisease8.setText("Trichomoniasis\n\n");
        msymptoms8.setText("Symptoms: Symptoms are rare in people with a penis, but they can include itching on the penis, painful urination, and penile discharge.\n" +
                "Around 20%  of people with trich acquire it again within 3 months of being treated.\n");
        mtreatment8.setText("Treatment: Trich is easy to cure and is usually treated with one dose of antibiotics\n\n\n");

        mtitleDisease9.setText("Pubic lice and scabies\n\n");
        mtreatment9.setText("The lice (commonly called crabs) are small bugs that are visible to the naked eye without the aid of a magnifying glass or microscope. The lice live on pubic hair (or any other hair) and are associated with itching." +
                "The treatment for pubic lice is usually with a 1% cream rinse of permethrin that is applied to the affected area and washed off after 10 minutes.\n");
        msymptoms9.setText(" Scabies is an ectoparasitic infection caused by a mite that is not visible with the naked eye but can be seen with a microscope. The parasites live on the skin and cause itching over the hands, arms, trunk, legs, and buttocks.\n\n\n");

        mprevention.setText("Prevention\n\n");
        mabtprevention.setText("However, by being aware of changes in your body and practicing safer sex, you can protect yourself and your partners.\n\n\n");









    }
}