import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
 <img id="imageUser" style="max-width: 20%; max-height: 20%;">
 <vaadin-vertical-layout style="align-items: flex-start; justify-content: center; height: 100%;">
  <label id="labelUsuario">Usuario </label>
  <label id="labelSeguidores">Seguidores </label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
  <label style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;" id="labelDescripcion">Descripcion </label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
