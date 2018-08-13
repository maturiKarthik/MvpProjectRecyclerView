# MvpProjectRecyclerView

## MVP ARCHITECTURE :


![Bluetooth BLE](https://cdn.journaldev.com/wp-content/uploads/2017/08/android-mvp-flow.png)

<ol>
<li>The Model is always the Buisness logic</li>
<li>The Presenter  is  the Middel Man between  Model and View.It retrieves data from the model and returns it formatted to the view</li>
<li>The View countains Activity and fragments UI And view will do is calling a presenter method every time there is a user action (a button click for example).</li>
</ol>

## RECYCLER VIEW :

please see the below link on android developer :

https://developer.android.com/guide/topics/ui/layout/recyclerview

## CODE TO IMPLEMENT CLICK EVENT IN RECYCLER VIEW :

```
 @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);
        //Setting On Click Listener ..
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"CLicked On"+mDataset[position],Toast.LENGTH_LONG).show();
            }
        });

    }
```
