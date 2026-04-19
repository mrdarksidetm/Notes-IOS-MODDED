package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f1925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f1926b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    x(TextView textView) {
        this.f1925a = (TextView) n3.g.h(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1926b;
        return textClassifier == null ? a.a(this.f1925a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1926b = textClassifier;
    }
}
