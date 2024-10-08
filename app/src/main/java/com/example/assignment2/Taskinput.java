public class TaskInputFragment extends Fragment {
    private EditText taskNameInput;
    private Button saveButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task_input, container, false);

        taskNameInput = view.findViewById(R.id.edit_text_task_name);
        saveButton = view.findViewById(R.id.button_save);

        saveButton.setOnClickListener(v -> {
            String taskName = taskNameInput.getText().toString();
            ((MainActivity) getActivity()).addTask(taskName);
            getActivity().getSupportFragmentManager().popBackStack();
        });

        return view;
    }
}
