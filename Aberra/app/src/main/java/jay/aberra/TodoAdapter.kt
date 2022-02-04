package jay.aberra

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(var context :Context, var listData: List<Todo_List>): RecyclerView.Adapter<TodoAdapter.TodosAdapter>() {

    class TodosAdapter(view: View): RecyclerView.ViewHolder(view){

        var incompleteView = view.findViewById<TextView>(R.id.new_note)
        var check = view.findViewById<CheckBox>(R.id.cb)
        var dateTime = view.findViewById<EditText>(R.id.dT)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodosAdapter {
            val view:View = LayoutInflater.from(context).inflate(R.layout.incomplete_view,parent,false)
            return TodosAdapter(view)
    }

//    fun remove(view:RecyclerView.ViewHolder){
//        listData.remove(it)
//    }

    override fun onBindViewHolder(holder: TodosAdapter, position: Int) {
        val currentPosition = listData[position]
        holder.incompleteView.text =  currentPosition.newTodo
        holder.check.isChecked = currentPosition.ischecked
        holder.dateTime.text.append(currentPosition.dueDate.toString())
    }

    override fun getItemCount(): Int {
        return listData.size
    }




}