package p2;

import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final ExtractedText a(e0 e0Var) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = e0Var.d();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = e0Var.d().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = i2.e0.j(e0Var.c());
        extractedText.selectionEnd = i2.e0.i(e0Var.c());
        extractedText.flags = !je.w.K(e0Var.d(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
