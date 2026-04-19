package i4;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f12490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12491b = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12492c = 0;

    /* JADX INFO: renamed from: i4.a$a, reason: collision with other inner class name */
    private static class C0299a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f12493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f12494b;

        C0299a(EditText editText, boolean z10) {
            this.f12493a = editText;
            g gVar = new g(editText, z10);
            this.f12494b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(i4.b.getInstance());
        }

        @Override // i4.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // i4.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f12493a, inputConnection, editorInfo);
        }

        @Override // i4.a.b
        void c(boolean z10) {
            this.f12494b.c(z10);
        }
    }

    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }
    }

    public a(EditText editText, boolean z10) {
        n3.g.i(editText, "editText cannot be null");
        this.f12490a = new C0299a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f12490a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f12490a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f12490a.c(z10);
    }
}
