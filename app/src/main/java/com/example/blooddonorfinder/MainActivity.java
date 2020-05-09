package com.example.blooddonorfinder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button oP, oN, bP, bN, aP, aN, abP, abN, sM;
    ArrayList<String> userNames = new ArrayList<>();
    ListView listViews;

    String subject = "Donate Blood it's Emergency" ;
    String message = "Respected Sir/Ma'am,\n\nThere is an immediate need of blood of your type. So it's a humble request to donate your blood to your nearest blood bank asap.\n\nDonate Blood, Save Life N Serve Humanity.\n\nThank You!";

    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference myRootRef = db.getReference();
    DatabaseReference userRef1 = myRootRef.child("O+");
    DatabaseReference userRef2 = myRootRef.child("O-");
    DatabaseReference userRef3, userRef4, userRef5, userRef6, userRef7, userRef8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oP = findViewById(R.id.oPositive);
        oN = findViewById(R.id.oNegative);
        bP = findViewById(R.id.bPositive);
        bN = findViewById(R.id.bNegative);
        aP = findViewById(R.id.aPositive);
        aN = findViewById(R.id.aNegative);
        abP = findViewById(R.id.abPositive);
        abN = findViewById(R.id.abNegative);
        sM = findViewById(R.id.sendEmail);
        listViews = findViewById(R.id.listView);


        userRef1.child("Rajat Singh").setValue("rajatsingh.chand@gmail.com");
        userRef2.child("Pranshul Agrawal").setValue("p.agarwal10698@gmail.com");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, userNames);
        listViews.setAdapter(arrayAdapter);

        oP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef1.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });

                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        oN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef2.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        aP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef5 = FirebaseDatabase.getInstance().getReference().child("A+");
                userRef5.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        aN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef6 = FirebaseDatabase.getInstance().getReference().child("A-");
                userRef6.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef3 = FirebaseDatabase.getInstance().getReference().child("B+");
                userRef3.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        bN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef4 = FirebaseDatabase.getInstance().getReference().child("B-");
                userRef4.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }

        });
        abP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef7 = FirebaseDatabase.getInstance().getReference().child("AB+");
                userRef7.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        abN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userRef8 = FirebaseDatabase.getInstance().getReference().child("AB-");
                userRef8.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                        final String value = dataSnapshot.getValue().toString();
                        userNames.add(value);
                        arrayAdapter.notifyDataSetChanged();
                        sM.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                sendEmail();
                            }
                        });
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }

    private void sendEmail(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        String recipientList = "";
        for (String str : userNames){
            recipientList = recipientList + " " +str;
            String[] recipient = recipientList.split(" ");
            intent.putExtra(Intent.EXTRA_EMAIL, recipient);
        }
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an Email client"));
    }
}
