
import axios from "axios";

const API = "http://localhost:8080/api/post";

// Get all posts
export const getPosts = () => axios.get(API);

// Get single post by ID
export const getPost = (id) =>
  axios.get(`${API}/${id}`);

// Create new post
export const createPost = (data) =>
  axios.post(API, data);

// Delete post
export const deletePost = (id) =>
  axios.delete(`${API}/${id}`);

// Update post
export const updatePost = (id, data) =>
  axios.put(`${API}/${id}`, data);
