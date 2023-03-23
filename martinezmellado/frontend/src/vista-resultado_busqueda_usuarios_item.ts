import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-resultado_busqueda_usuarios_item')
export class VistaResultado_busqueda_usuarios_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout class="content" style="width: 100%; align-items: center;">
 <iron-icon style="width: 30%; height: 100%;" icon="lumo:user"></iron-icon>
 <vaadin-vertical-layout theme="spacing-s" style="align-items: flex-start; justify-content: center; height: 100%;">
  <label>Usuario </label>
  <label>Seguidores</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
  <label style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;">Descripcion</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-xs" style="flex-shrink: 0; align-self: center; align-items: flex-end; margin-top: var(--lumo-space-m); justify-content: center; margin-right: var(--lumo-space-m);">
  <img style="width: 20%;" src="../../resources/icons/video.png">
  <label>Ultima Publicacion </label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
