package u5;

import ae.r;
import android.view.View;
import android.widget.ImageButton;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final void b(final ImageButton imageButton, final zd.a<i0> aVar) {
        r.f(imageButton, "<this>");
        r.f(aVar, "onClick");
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: u5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.c(imageButton, aVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ImageButton imageButton, zd.a aVar, View view) {
        r.f(imageButton, "$this_onClick");
        r.f(aVar, "$onClick");
        imageButton.setClickable(false);
        aVar.invoke();
        imageButton.setClickable(true);
    }
}
