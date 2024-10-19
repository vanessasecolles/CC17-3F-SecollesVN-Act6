import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_secollesvn_act6.FitnessTip
import com.example.cc17_3f_secollesvn_act6.R

class FitnessTipAdapter(private val fitnessTipList: List<FitnessTip>) :
    RecyclerView.Adapter<FitnessTipAdapter.FitnessTipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FitnessTipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fitness_tip, parent, false)
        return FitnessTipViewHolder(view)
    }

    override fun onBindViewHolder(holder: FitnessTipViewHolder, position: Int) {
        val currentTip = fitnessTipList[position]
        holder.imageView.setImageResource(currentTip.imageResource)
        holder.dayTitle.text = "Day ${position + 1}"
        holder.tipHeading.text = currentTip.tipText
        holder.tipDescription.text = currentTip.description
    }

    override fun getItemCount(): Int {
        return fitnessTipList.size
    }

    class FitnessTipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val dayTitle: TextView = itemView.findViewById(R.id.dayTitle)
        val tipHeading: TextView = itemView.findViewById(R.id.tipHeading)
        val tipDescription: TextView = itemView.findViewById(R.id.tipDescription)
    }
}
