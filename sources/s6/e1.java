package s6;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20058a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20056c = f1.a("193C0264");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20055b = File.separatorChar + f1.b(f1.c("442C0E7AAC27705196115B47")) + File.separatorChar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f20057d = {f1.b(f1.c("031E264A903A664EBC225B0509753813D12B7E474F4417625DE1574F729FFE5B46")), f1.b(f1.c("523C206EF03A62588C1E655625460C2AAD0D707B2A23337A78")), f1.b(f1.c("74731E4B852469588D3751043E7C116BA7376B5E45")), f1.b(f1.c("60710E4E84017D4EB144707727461061F72546475E350B7B4AB272696AAFB44B7B011C71A5055966")), f1.b(f1.c("78280930A6246268D7354578255A0964CB541B4D5B36254566E15A4D6DBFE93F50313930A62E6B4D")), f1.b(f1.c("5228053CBC766B51A5005E05095B1719FE121D43243B176D7CED5755789EC1496F3504638D764044")), f1.b(f1.c("73025B4BB830185B800E0D46376C1F03D334595628161D67448F414B43B0CB647E1D2B")), f1.b(f1.c("7D340B66A82E5672BE320C01697A1810D3326C5D444118785EB253573086C861603E5C7A86221713")), f1.b(f1.c("7F752967B939686389317673153C303AF31678795F3D2B315680765F6DA4CD7562051F44A3")), f1.b(f1.c("62112531FE7B464EA21D095D08613B03FD37787D71313C7D45BF2C2B7FCFC75D0F2638")), f1.b(f1.c("70770C72FA216A47A11F7A0417553E34D9376F1A5E3221506295522D6387FA6D6502")), f1.b(f1.c("013515318E316715D5187557235B1D18C63A4D7574390360529F296B4FB5BE407F22")), f1.b(f1.c("52113C5EB3287B78AC47536439441004CB067F455402365A47902958389ABE560E140D669905")), f1.b(f1.c("552F3F7BBC164B56A1045E0668784D35D33068176E07144D07AB515B4FB2D855657229709F27185B")), f1.b(f1.c("59282D3FFC1A1C19D1375B7B15444E25FC37607F451F1E4E07955C296AB2EE437B2B00")), f1.b(f1.c("79000B3A8F32594BD6427E7A16583F6AAF34196B2E23386D788B6D2A65B3EF654D0B0C5EAA144B4EB11374503C691905E6")), f1.b(f1.c("7928075A990E4457B401567C2275093FA60168552C333D447DA04D4D3FC4CB450F7D264CA502")), f1.b(f1.c("5A035B6F8B2E4269D141474E30641F05A60C686D5F49136F61EB566E59A2F66804702C63AF155C73")), f1.b(f1.c("60750958AB095F45D006485506553934CC2D63196439023D408170534485C86366370451")), f1.b(f1.c("40130E4C86027B16D2265E6C183D143BDD2E707845401C4B01B32B7F4C98FC3D6F2B2E648E095E53")), f1.b(f1.c("042E2950A4247F138C1D496C0267282BD631497D6E25214907BA50225AA5CF595C7659")), f1.b(f1.c("72203D70AF0A4670BE187A53294A3A2AEB36455C6B44117F44AA22556A81CE79602E075182356555")), f1.b(f1.c("6D115E41F10F1E659323504D057D0A1BE60A63167D21304C79AD73547FBDEB37422C03399F27584E")), f1.b(f1.c("53001F51AF0B665BD4225B7A37603D18D11B6B777F00374D41955D556C9AC96965295A5FF9047946")), f1.b(f1.c("422D2B67F1144458963F4C60684B4967DB1B4F174F136B7C459842707E8EC438432A1D38")), f1.b(f1.c("60083D79AD305F588216097C1B4A4F3CDD126F574D02604400BD70")), f1.b(f1.c("5673173AA3764647AD0E5F453340483FDA1262166B08305C468E5D7C45C6EB76511520")), f1.b(f1.c("712A297A8E2C7F40D63F0B7A3D5D2C2AC50A4D64283C275264BD57707E94F87A0E2E0871A12C1944")), f1.b(f1.c("5F321731A62A1A6B9D19547F01353714CC2A4F5D55022B3068B4622F6AAFF93847210444A21B6C79")), f1.b(f1.c("7A0C184BAB20181485267550026A3962E620436B"))};

    public e1(Context context, String str, String[] strArr) {
        this.f20058a = context.getSharedPreferences(a(context, str, strArr), 0);
    }

    public final String a(Context context, String str, String[] strArr) {
        try {
            String strB = b(context, strArr);
            if (!strB.isEmpty()) {
                return strB;
            }
            LinkedList linkedList = new LinkedList();
            g(strArr, linkedList);
            new File(context.getFilesDir().getParent() + f20055b).mkdir();
            String str2 = (String) linkedList.get(new Random().nextInt(linkedList.size()));
            if (j(context, str)) {
                e(context, str, str2);
            } else {
                d(context, str2);
            }
            return str2;
        } catch (Exception unused) {
            return str;
        }
    }

    public final String b(Context context, String[] strArr) {
        for (String str : f20057d) {
            for (String str2 : strArr) {
                if (new File(context.getFilesDir().getParent() + f20055b + str2 + str + f1.a("193C0264")).exists()) {
                    return str2 + str;
                }
            }
        }
        return f1.a("");
    }

    public void c() {
        SharedPreferences.Editor editorEdit = this.f20058a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final void d(Context context, String str) throws IOException {
        if (!new File(context.getFilesDir().getParent() + f20055b + str + f1.a("193C0264")).createNewFile()) {
            throw new IOException(f1.b(f1.c("642C0E7AAC270F7196115B5123681231FA110A427D173B6B10BF72766DD6E46659304F6BA63643458A53491433685C31ED074B5B7914726A49F97D736493FF7644300A65")));
        }
    }

    public final void e(Context context, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getParent());
        String str3 = f20055b;
        sb2.append(str3);
        sb2.append(str);
        sb2.append(f1.a("193C0264"));
        if (!new File(sb2.toString()).renameTo(new File(context.getFilesDir().getParent() + str3 + str2 + f1.b(f1.c("193C0264"))))) {
            throw new IOException(f1.b(f1.c("7826097DBA204E558D1B53143C641B20FE1643407250316745B57F742F82AC7D522A0E65AC6340538D13545A30615C06FE0E594A7F50216051AB7E7E2886FE6A51211D6DA7204A52")));
        }
    }

    public void f(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f20058a.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public final void g(String[] strArr, List<String> list) {
        for (String str : f20057d) {
            for (String str2 : strArr) {
                list.add(str2 + str);
            }
        }
    }

    public boolean h(String str) {
        return this.f20058a.contains(str);
    }

    public void i(String str) {
        SharedPreferences.Editor editorEdit = this.f20058a.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public final boolean j(Context context, String str) {
        return new File(context.getFilesDir().getParent() + f20055b + str + f1.a("193C0264")).exists();
    }

    public String k(String str) {
        return this.f20058a.getString(str, null);
    }
}
