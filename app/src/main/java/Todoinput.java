public class MainActivity extends AppCompatActivity {
    private ArrayList<String> tasks;
    private TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasks = new ArrayList<>();
        RecyclerView taskList = findViewById(R.id.recycler_view);
        taskList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TaskAdapter(tasks);
        taskList.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab_add_task);
        fab.setOnClickListener(v -> {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, new TaskInputFragment());
            ft.commit();
        });
    }
) {
        tasks.add(task);
        adapter.notifyDataSetChanged();
        public void addTask(String task
    }
}
