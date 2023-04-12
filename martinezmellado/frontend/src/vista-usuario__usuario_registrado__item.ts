import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-usuario__usuario_registrado__item')
export class VistaUsuario__usuario_registrado__item extends LitElement {
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
<vaadin-horizontal-layout style="width: 100%; align-items: center;">
 <iron-icon id="Foto" style="width: 30%; height: 100%;" icon="lumo:user"></iron-icon>
 <vaadin-vertical-layout style="align-items: flex-start; justify-content: center; height: 100%;">
  <label>Usuario </label>
  <label>Seguidores </label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
  <label style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;">Descripcion </label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: flex-end; margin-top: var(--lumo-space-m); justify-content: center; margin-right: var(--lumo-space-m);">
  <img style="width: 20%;" src="../../resources/icons/video.png">
  <label style="padding-right: var(--lumo-space-s);">Ultima Publicacion </label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
